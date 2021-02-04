package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: rx.internal.observers.AssertableSubscriberObservable<kotlin.Any> = rx.internal.observers.AssertableSubscriberObservable(rx.observers.TestSubscriber())
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()
	private 	val instance_var_1_2: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: rx.observers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: rx.internal.util.unsafe.SpscArrayQueue<kotlin.Any>
	) {
		for (iAb in 0..2) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

				val local_var_4_1: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()
				local_var_4_1.method0("SomeString")

			}
			val local_var_3_0: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
			local_var_3_0.method0("SomeString", "SomeString", "SomeString")

			local_var_3_0.method1("SomeString", "SomeString", "SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAE,
		param1: com.android.example.module06_module353_module2.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method2(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		param0.get()

	}
}

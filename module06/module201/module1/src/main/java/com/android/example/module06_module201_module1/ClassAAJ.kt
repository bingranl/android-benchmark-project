package com.android.example.module06_module201_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.schedulers.TestScheduler,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onComplete()

		for (iAb in 0..1) {
			for (iAc in 0..2) {
				val local_var_4_0: com.android.example.module06_module321_module10.ClassAAH = com.android.example.module06_module321_module10.ClassAAH()
				local_var_4_0.method1("SomeString")

				val local_var_4_1: com.android.example.module06_module321_module10.ClassAAH = com.android.example.module06_module321_module10.ClassAAH()
				local_var_4_1.method0("SomeString", "SomeString", "SomeString", "SomeString")

				val local_var_4_2: com.android.example.module06_module321_module10.ClassAAI = com.android.example.module06_module321_module10.ClassAAI()
				local_var_4_2.method3("SomeString")

			}
		}
		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAF = com.android.example.module06_module337_module3.ClassAAF()
		local_var_2_4.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAG = com.android.example.module06_module321_module10.ClassAAG()
		local_var_2_2.method1("SomeString", "SomeString")

		param0.isDisposed()

	}
}

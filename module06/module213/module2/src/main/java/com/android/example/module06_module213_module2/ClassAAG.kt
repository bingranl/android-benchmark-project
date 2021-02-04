package com.android.example.module06_module213_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module213_module5.ClassAAC = com.android.example.module06_module213_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module213_module5.ClassAAE = com.android.example.module06_module213_module5.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module213_module5.ClassAAB = com.android.example.module06_module213_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAA
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.start()

	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAJ,
		param1: com.android.example.module06_module213_module5.ClassAAF,
		param2: com.android.example.module06_module213_module5.ClassAAA
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.util.AppendOnlyLinkedArrayList(7))

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module213_module5.ClassAAH,
		param1: com.android.example.module06_module213_module5.ClassAAA
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}
}

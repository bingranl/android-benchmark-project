package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAB = com.android.example.module06_module353_module2.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module353_module2.ClassAAB = com.android.example.module06_module353_module2.ClassAAB()

	fun method0(
		param0: rx.subscriptions.BooleanSubscription,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: com.android.example.module06_module353_module2.ClassAAC
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module353_module2.ClassAAG = com.android.example.module06_module353_module2.ClassAAG()
			local_var_3_0.method2("SomeString")

		}
		for (iAb in 0..5) {
			val local_var_3_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
			local_var_3_0.onCompleted()

			val local_var_3_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
			local_var_3_1.createWorker()

			val local_var_3_2: rx.internal.observers.AssertableSubscriberObservable<kotlin.Any> = rx.internal.observers.AssertableSubscriberObservable(rx.observers.TestSubscriber())
			local_var_3_2.getOnErrorEvents()

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
		local_var_2_1.method0("SomeString", "SomeString", "SomeString")

		param0.requestMore(-7125101490105372787)

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

	}

	fun method2(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: com.android.example.module06_module353_module2.ClassAAE,
		param3: com.android.example.module06_module353_module2.ClassAAE
	) {
		param0.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.disposables.SerialDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: com.android.example.module06_module353_module2.ClassAAE
	) {
		param0.onError(kotlin.Throwable())

		val local_var_2_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_4.requestMore(3855851552594655327)

		val local_var_2_5: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_5.triggerActions()

		param0.isDisposed()

	}
}
